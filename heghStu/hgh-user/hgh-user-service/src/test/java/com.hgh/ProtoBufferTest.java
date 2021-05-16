package com.hgh;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import lombok.extern.slf4j.Slf4j;

/**
 * ProtoBufferTest
 *
 * @author lf
 * @date 2021/5/15
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProtoBufferTest {

    @Test
    public void test() {
        pb.Package.Pack.Builder builder = pb.Package.Pack.newBuilder();
        builder.setContext(200);
        System.out.println("Hello Spring.");
        byte[] bytes = builder.build().toByteArray();
        log.info(bytes.toString());

        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            URI uri = new URI("http", null, "127.0.0.1", 8001, "/user/test", "", null);
            HttpPost post = new HttpPost(uri);
            post.setEntity(new ByteArrayEntity(bytes));
            HttpResponse response = httpClient.execute(post);

            log.info("=========");
        }catch (Exception e){

        }

    }
}
