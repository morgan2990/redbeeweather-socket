package com.rodrigo.redbeeweather.socket.main;

            import com.corundumstudio.socketio.AckRequest;
            import com.corundumstudio.socketio.Configuration;
            import com.corundumstudio.socketio.SocketIOClient;
            import com.corundumstudio.socketio.SocketIOServer;
            import com.corundumstudio.socketio.listener.DataListener;

public class WeatherSocketServer {


        public static void main(String[] args) throws InterruptedException {

            Configuration config = new Configuration();
            config.setHostname("localhost");
            config.setPort(9092);

            final SocketIOServer server = new SocketIOServer(config);


            server.addEventListener("weatherCondition", ReceivedWeatherCondition.class, new DataListener<ReceivedWeatherCondition>() {
                @Override
                public void onData(final SocketIOClient client, ReceivedWeatherCondition data, final AckRequest ackRequest) {

                    server.getBroadcastOperations().sendEvent("weatherCondition", data.getReceivedWeatherCondition());

                }
            });

            server.start();

            Thread.sleep(Integer.MAX_VALUE);

            server.stop();
        }

}
