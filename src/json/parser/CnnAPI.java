package json.parser;

import sun.plugin2.message.GetAppletMessage;

public class CnnAPI {

}
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
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

       /* https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=645a1d50c742457c82c06ee4fedf1bae
}
 {
	"status": "ok",
	"totalResults": 10,
	"articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Anderson Cooper: What is Ivanka's expertise in anything? - CNN Video",
		"description": "Kirsten Powers and Mike Shields join Anderson Cooper to discuss CNN's report that President Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance.",
		"url": "http://us.cnn.com/videos/politics/2019/03/06/ivanka-trump-security-clearance-anderson-cooper-ac360-bts-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170117122327-ivanka-trump-donald-trump-file-super-tease.jpg",
		"publishedAt": "2019-03-06T03:08:15.0993886Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Hear Trump question his authority over Kushner clearance - CNN Video",
		"description": "In January 2019 audio from an interview with The New York Times, President Trump tells Maggie Haberman he was never involved with his son-in-law Jared Kushner's security clearance.",
		"url": "http://us.cnn.com/videos/politics/2019/03/01/trump-audio-kushner-security-clearance-nyt-haberman-sot-ebof-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170530121000-04-jared-kushner-file-super-tease.jpg",
		"publishedAt": "2019-03-06T01:23:35.4150025Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Pamela Brown and Kaitlan Collins, CNN",
		"title": "President pressured staff to grant security clearance to Ivanka Trump",
		"description": "President Donald Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance against their recommendations, three people familiar with the matter told CNN.",
		"url": "http://us.cnn.com/2019/03/05/politics/ivanka-trump-security-clearance-pressure/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180301175144-01-ivanka-trump-super-tease.jpg",
		"publishedAt": "2019-03-06T01:00:29Z",
		"content": "Washington (CNN)President Donald Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance against their recommendations, three people familiar with the mat… [+4131 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
		"title": "The Trump tax return fight is coming back in a major way",
		"description": "One day after announcing a broad inquiry into President Trump's political and personal life, House Democrats began to offer some hints as to how they plan to pry Trump's most closely held secret from him.",
		"url": "http://us.cnn.com/2019/03/05/politics/trump-tax-return-house-investigation/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170417155321-trump-tax-returns-cnnmoney-super-tease.jpg",
		"publishedAt": "2019-03-06T00:33:25Z",
		"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Katelyn Polantz, CNN",
		"title": "Judge blasts Roger Stone book release amid gag order",
		"description": "Roger Stone is one step closer -- again -- to being in serious trouble with a federal judge that has let him out on bail.",
		"url": "http://us.cnn.com/2019/03/05/politics/roger-stone-amy-berman-jackson-gag-order/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190221192923-roger-stone-gag-order-trump-ted-deutch-inv-tsr-vpx-00000310-super-tease.jpg",
		"publishedAt": "2019-03-05T20:44:33Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Harry Enten, CNN",
		"title": "Early polling suggests 2020 will be about Trump. That's bad news for him.",
		"description": "President Donald Trump was able to win the White House in 2016 despite being the least liked major party nominee in history. Today, more people continue to dislike than like Trump.",
		"url": "http://us.cnn.com/2019/03/05/politics/2020-bad-news-trump/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305012913-0305-trump-photo-01-super-tease.jpg",
		"publishedAt": "2019-03-05T16:08:47Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Stephen Collinson, CNN",
		"title": "Democratic investigations now target Trump's entire world",
		"description": "Nearly everyone in Donald Trump's world just became a potential witness.",
		"url": "http://us.cnn.com/2019/03/05/politics/democratic-investigations-trump-entire-world/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190304121603-nadler-trump-split-super-tease.jpg",
		"publishedAt": "2019-03-05T13:32:13Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Devan Cole, CNN",
		"title": "Warner: Trump has 'consistently been willing to override the advice' of intel community",
		"description": "The top Democrat on the Senate Intelligence Committee said Sunday that President Donald Trump \"has consistently been willing to override the advice of the intelligence community\" on everything from his son-in-law and senior adviser Jared Kushner's security cl…",
		"url": "http://us.cnn.com/2019/03/03/politics/mark-warner-jared-kushner-cnntv/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180428152112-senator-mark-warner-super-tease.jpg",
		"publishedAt": "2019-03-03T16:42:52Z",
		"content": "Washington (CNN)The top Democrat on the Senate Intelligence Committee said Sunday that President Donald Trump \"has consistently been willing to override the advice of the intelligence community\" on everything from his son-in-law and senior adviser Jared Kushn… [+1577 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
		"title": "The Jared Kushner security clearance story reveals Donald Trump's two biggest flaws",
		"description": "If you needed one clear example of the fundamental flaws of Donald Trump's presidency, this new reporting out of The New York Times would do the trick nicely: The President reportedly ordered his then-chief of staff John Kelly to secure a top-secret security …",
		"url": "http://us.cnn.com/2019/03/01/politics/jared-kushner-donald-trump-security-clearance/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180302121601-17-jared-kushner-super-tease.jpg",
		"publishedAt": "2019-03-02T14:14:04Z",
		"content": "(CNN)If you needed one clear example of the fundamental flaws of Donald Trump's presidency, this new reporting out of The New York Times would do the trick nicely: The President reportedly ordered his then-chief of staff John Kelly to secure a top-secret secu… [+4066 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Veronica Stracqualursi, CNN",
		"title": "Ivanka Trump: President had 'zero' involvement in security clearances for her, Kushner",
		"description": "Ivanka Trump denied that her father was involved in securing top security clearances for herself or her husband, Jared Kushner, both senior advisers in the White House.",
		"url": "http://us.cnn.com/2019/02/08/politics/ivanka-trump-jared-kushner-security-clearances/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190208080237-ivanka-trump-abc-news-intv-super-tease.jpg",
		"publishedAt": "2019-02-08T22:45:03Z",
		"content": null
	}]
