

package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class CnnAPI {

 /*     You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=645a1d50c742457c82c06ee4fedf1bae

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.
}
      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

*/

/*"status": "ok",
"totalResults": 10,
-"articles": [
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": null,
"title": "Trump falsely claims Ivanka 'created millions of jobs'  - CNN Video",
"description": "President Trump claimed his daughter Ivanka Trump \"created a million jobs\" during an address to US governors. No matter how you spin it, that's not true.",
"url": "http://us.cnn.com/videos/politics/2019/02/25/trump-ivanka-created-millions-jobs-training-programs-sot-vpx.cnn",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190213112809-ivanka-trump-wilbur-ross-super-tease.jpg",
"publishedAt": "2019-03-07T01:38:36.7353902Z",
"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": null,
"title": "Anderson Cooper: What is Ivanka's expertise in anything? - CNN Video",
"description": "Kirsten Powers and Mike Shields join Anderson Cooper to discuss CNN's report that President Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance.",
"url": "http://us.cnn.com/videos/politics/2019/03/06/ivanka-trump-security-clearance-anderson-cooper-ac360-bts-vpx.cnn",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170117122327-ivanka-trump-donald-trump-file-super-tease.jpg",
"publishedAt": "2019-03-07T01:38:30.4229046Z",
"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
},*/

public static void main(String[] args) throws MalformedURLException, IOException {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=645a1d50c742457c82c06ee4fedf1bae";
        Headline head = null;
        List<Headline> news = new ArrayList<>();
        URL url1 = new URL(sURL);
        URLConnection request = url1.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonObject rootObj = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }

        while (jsonArray==null)
            jsonArray = rootObj.getAsJsonArray("articles");


        for (int i = 0; i < jsonArray.size(); i++) {
            try {

                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();

                String source = jsonobject.get("source").toString();
                System.out.println(source);

                String author = jsonobject.get("author").toString();
                System.out.println(author);

                String title = jsonobject.get("title").toString();
                System.out.println(title);

                String description = jsonobject.get("description").toString();
                System.out.println(description);

                String url = jsonobject.get("url").toString();
                System.out.println(url);

                String urlToImage = jsonobject.get("urlToImage").toString();
                System.out.println(urlToImage);

                String publishedAt = jsonobject.get("publishedAt").toString();
                System.out.println(publishedAt);

                String content = jsonobject.get("content").toString();
                System.out.println(content);

                head = new Headline(head.getSource(), head.getAuthor(), head.getTitle(), head.getDescription(),
                        head.getUrl(), head.getUrlToImage(), head.getPublishedAt(), head.getContent());

                news.add(head);

            } catch (Exception ex) {

            }
        }

        for (Headline entry : news) {
            System.out.println(entry.getSource() + " " + entry.getAuthor() + " " + entry.getTitle() + " "
                    + entry.getDescription() + " " + entry.getUrl() + " " + entry.getUrlToImage() + " " + entry.getPublishedAt() + " "
                    + entry.getContent());
        }

    }


    public static void main(String[] args) throws MalformedURLException, IOException {
		String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=645a1d50c742457c82c06ee4fedf1bae";
		Headline head = null;
		List<Headline> news = new ArrayList<>();
		URL url1 = new URL(sURL);
		URLConnection request = url1.openConnection();
		request.connect();
		JsonArray jsonArray = null;
		JsonObject rootObj = null;
		JsonParser jp = new JsonParser();
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
		if (root instanceof JsonObject) {
			rootObj = root.getAsJsonObject();
		} else if (root instanceof JsonArray) {
			jsonArray = root.getAsJsonArray();
		}

		while (jsonArray == null)
			jsonArray = rootObj.getAsJsonArray("articles");


		for (int i = 0; i < jsonArray.size(); i++) {
			try {

				JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();

				String source = jsonobject.get("source").toString();
				System.out.println(source);

				String author = jsonobject.get("author").toString();
				System.out.println(author);

				String title = jsonobject.get("title").toString();
				System.out.println(title);

				String description = jsonobject.get("description").toString();
				System.out.println(description);

				String url = jsonobject.get("url").toString();
				System.out.println(url);

				String urlToImage = jsonobject.get("urlToImage").toString();
				System.out.println(urlToImage);

				String publishedAt = jsonobject.get("publishedAt").toString();
				System.out.println(publishedAt);

				String content = jsonobject.get("content").toString();
				System.out.println(content);

				head = new Headline(head.getSource(), head.getAuthor(), head.getTitle(), head.getDescription(),
						head.getUrl(), head.getUrlToImage(), head.getPublishedAt(), head.getContent());

				news.add(head);

			} catch (Exception ex) {
			}
		}
	}}