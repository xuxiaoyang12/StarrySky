package com.starry.sky.web;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;

import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * es 测试
 */
public class Demo {


    /**
     * elasticsearch 1.7.0版本 对应的java API
     * @param args
     */
    public static void main(String[] args) {

        //设置
        Settings settings = ImmutableSettings.settingsBuilder()
                .put("cluster.name", "es_cluster").build();
        //获取客户端
        Client client =    new TransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress("33.159.136.159",9300));

        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        boolQueryBuilder.must(QueryBuilders.termQuery("kkid","330521210034"));


        SearchResponse qqq = client.prepareSearch("traffic_index_201809201812")
                .setTypes("AfterVehicle")
                .setQuery(boolQueryBuilder)
                .execute()
                .actionGet();

        //解析返回数据
        System.out.println(qqq);

    }

}
