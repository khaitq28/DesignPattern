package pattern.builder.message.svn.dto;

/**
 * Created by khaitq
 * Date: 18/05/2018
 * Github:  https://github.com/quangkhai88
 */

public class AddressDTO {

    private String host;

    @Override
    public String toString() {
        return "AddressDTO{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }

    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
