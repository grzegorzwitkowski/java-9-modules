package com.socket;

import java.io.Closeable;
import java.util.Iterator;
import java.util.ServiceLoader;

import com.socket.spi.NetworkSocketProvider;

public abstract class NetworkSocket implements Closeable {

  protected NetworkSocket() {}

  public static NetworkSocket open() {
    ServiceLoader<NetworkSocketProvider> sl = ServiceLoader.load(NetworkSocketProvider.class);
    Iterator<NetworkSocketProvider> it = sl.iterator();
    if (!it.hasNext()) {
      throw new RuntimeException("No service providers found!");
    }
    NetworkSocketProvider provider = it.next();
    return provider.openNetworkSocket();
  }
}
