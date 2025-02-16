package pattern.observer;


public class NewsChannel  implements Channel{

	private String news;
	
	@Override
	public void update(Object obj) {
		setNews((String) obj);
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		System.out.println(this + " get news: "+  this.news + " - ");
	}

}
