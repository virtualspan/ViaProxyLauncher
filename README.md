# ViaProxyLauncher

A simple jar file to run ViaProxy on hosts that don't allow you to have a custom startup command.

## Usage:
1. Put both the regular ViaProxy jar from the [ViaProxy Releases Page](https://github.com/ViaVersion/ViaProxy/releases) and the ViaProxyLauncher jar from [here](https://github.com/virtualspan/ViaProxyLauncher/releases) in the base directory.
2. Rename ViaProxy-whateverversion.jar to ViaProxy.jar
3. Now you can run the ViaProxyLauncher.jar file as normal. No extra java arguments are needed making it work with all hosts. On some hosts where you cannot specify the jar file name, you may need to rename ViaProxyLauncher.jar to server.jar

This will run the regular ViaProxy jar with the command `java -jar ViaProxy.jar config viaproxy.yml`, meaning that you will be able to use ViaProxy normally as CLI, and your ViaProxy config file will be called viaproxy.yml
