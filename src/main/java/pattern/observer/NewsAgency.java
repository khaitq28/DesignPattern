package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
	private String news; 
	
	private final List<Channel> channels = new ArrayList<>();
	
	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObserver(Channel channel) {
		this.channels.remove(channel);
	}
	
	public String getNews() {
		return this.news;
	}
	
	public void setNews(String news) {
		this.news = news;
		this.channels.forEach(channel -> channel.update(news));
	}
	
	
	public static void main(String ...agrs) {
		
		NewsAgency agency = new NewsAgency();
		NewsChannel channel1 = new NewsChannel();
		NewsChannel channel2 = new NewsChannel();
		agency.addObserver(channel1);
		agency.addObserver(channel2);
		
		agency.setNews("test");
	
	}

}
