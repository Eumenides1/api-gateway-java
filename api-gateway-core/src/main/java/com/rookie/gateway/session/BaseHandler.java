package com.rookie.gateway.session;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author Jaguarliu
 * @description 数据处理器基类
 * @param <T>
 */
public abstract class BaseHandler<T> extends SimpleChannelInboundHandler<T> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, T msg) throws Exception {
        session(ctx,ctx.channel(),msg);
    }

    protected abstract void session(ChannelHandlerContext ctx, final Channel channel, T request);
}
