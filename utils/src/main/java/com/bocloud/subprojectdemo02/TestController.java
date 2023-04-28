package com.bocloud.subprojectdemo02;

import com.bocloud.subprojectdemo02.protos.UserProto;
import com.bocloud.subprojectdemo02.protos.UserServiceGrpc;
import com.google.api.client.util.Value;
import io.grpc.ClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.channelz.v1.Server;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Channel;

@RestController
@RequestMapping("/test/user")
public class TestController {
    @Value("{{user.url}}")
    String baseurl;
    @Value("{{user.port}}")
    Integer port;


    @GetMapping("{id}")
    public UserProto.UserModel byId(@PathVariable("id") Integer id) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(baseurl + "/" + id, port).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub = UserServiceGrpc.newBlockingStub(channel);
        UserProto.SearchIdRequest build = UserProto.SearchIdRequest.newBuilder().setId(id).build();
        return userServiceBlockingStub.byId(build);
    }

    @PostMapping
    public UserProto.AddResponse add(@RequestBody UserProto.UserModel user) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(baseurl, port).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub = UserServiceGrpc.newBlockingStub(channel);
        return userServiceBlockingStub.add(user);
    }


}
