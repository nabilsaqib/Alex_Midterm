

package json.parser;

import sun.plugin2.message.GetAppletMessage;

public class CnnAPI {

}

/**
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

     *//*


"status": "ok",
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
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Priscilla Alvarez, CNN",
"title": "471 parents deported from US without children during family separations",
"description": "The Trump administration identified 471 parents who were removed from the United States without their children and \"without being given the opportunity to elect or waive reunification,\" according to the latest court filing in an ongoing lawsuit,",
"url": "http://us.cnn.com/2019/03/06/politics/family-separation-update-immigration-border/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180614143936-family-separation-super-tease.jpg",
"publishedAt": "2019-03-07T00:37:36Z",
"content": null
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Caroline Kelly and Gregory Krieg, CNN",
"title": "Bernie Sanders, Kamala Harris defend Ilhan Omar amid controversy over Israel comments",
"description": "Democratic presidential candidates Sens. Bernie Sanders and Kamala Harris on Wednesday defended Rep. Ilhan Omar against the backlash to her comments slamming pro-Israel groups and politicians, which have been called anti-Semitic.",
"url": "http://us.cnn.com/2019/03/06/politics/bernie-sanders-defends-ilhan-omar/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190302135627-04-bernie-sanders-rally-nyc-0302-super-tease.jpg",
"publishedAt": "2019-03-07T00:33:22Z",
"content": "(CNN)Democratic presidential candidates Sens. Bernie Sanders and Kamala Harris on Wednesday defended Rep. Ilhan Omar against the backlash to her comments slamming pro-Israel groups and politicians, which have been called anti-Semitic.\r\nSanders, who is Jewish,… [+3017 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Julian Zelizer, CNN Political Analyst",
"title": "The hunt for a smoking gun in investigating Trump",
"description": "Juliam Zelizer writes that many may be wondering if there is one piece of damning evidence in special counsel Robert Mueller's report that will prove that Donald Trump should be impeached, but Congress should be focused on the big picture of the report.",
"url": "http://us.cnn.com/2019/03/06/opinions/mueller-report-smoking-gun-trump-zelizer/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/170613101920-trump-mueller-split-2-super-tease.jpg",
"publishedAt": "2019-03-06T23:01:24Z",
"content": "Zelizer is a professor of history and public affairs at Princeton University, and author, with Kevin Kruse, of the new book \"Fault Lines: A History of the United States Since 1974.\" The opinions expressed in this commentary are his own. View more opinion at C… [+8391 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Pamela Brown and Kaitlan Collins, CNN",
"title": "President pressured staff to grant security clearance to Ivanka Trump",
"description": "President Donald Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance against their recommendations, three people familiar with the matter told CNN.",
"url": "http://us.cnn.com/2019/03/05/politics/ivanka-trump-security-clearance-pressure/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180726135146-ivanka-trump-iowa-07262018-super-tease.jpg",
"publishedAt": "2019-03-06T22:21:23Z",
"content": "Washington (CNN)President Donald Trump pressured his then-chief of staff John Kelly and White House counsel Don McGahn to grant his daughter and senior adviser Ivanka Trump a security clearance against their recommendations, three people familiar with the mat… [+4131 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Samantha Vinograd",
"title": "Trump's Jared and Ivanka problem",
"description": "In her presidential weekly briefing, Samantha Vinograd writes that several of Trump's actions -- including his alleged role in securing Jared Kushner's and Ivanka Trump's security clearances -- undermine our relationships with our foreign intelligence allies.",
"url": "http://us.cnn.com/2019/03/03/opinions/presidential-weekly-briefing-kushner-problem-vinograd/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181030152742-02-ivanka-trump-jared-kushner-departure-1030-super-tease.jpg",
"publishedAt": "2019-03-06T20:02:55Z",
"content": "Samantha Vinograd is a CNN national security analyst. She served on President Obama's National Security Council from 2009-2013 and at the Treasury Department under President George W. Bush. Follow her @sam_vinograd. The views expressed in this commentary are … [+10546 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Betsy Klein, CNN",
"title": "What does Ivanka Trump do?",
"description": "Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration.",
"url": "http://us.cnn.com/2019/03/06/politics/ivanka-trump-security-clearance-white-house/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190213112809-ivanka-trump-wilbur-ross-super-tease.jpg",
"publishedAt": "2019-03-06T18:40:55Z",
"content": "Washington (CNN)Ivanka Trump became a full-time adviser to the President in March 2017 after informally advising her father, Donald Trump, during the first two months of his administration. \r\nCritics point out her lack of government experience, but defenders … [+6569 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
"title": "Donald Trump is laying the groundwork to de-legitimize the 2020 election",
"description": "Even as the 2020 race begins in earnest, President Donald Trump is already suggesting that Democrats cannot beat him fairly -- raising the specter that if he loses next November, he will suggest that the election was not legitimate.",
"url": "http://us.cnn.com/2019/03/06/politics/donald-trump-2020-election-illegitimate/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306094939-trump-03052019-super-tease.jpg",
"publishedAt": "2019-03-06T17:05:53Z",
"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Kate Sullivan, CNN",
"title": "White House rejects request for Kushner security clearance documents",
"description": "The White House rejected a demand from the House Oversight Committee to turn over documents and comply with interviews concerning the security clearances of some of President Donald Trump's closest advisers, including Trump senior adviser and son-in-law Jared…",
"url": "http://us.cnn.com/2019/03/05/politics/white-house-security-clearance-ivanka-trump-jared-kushner/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190116184539-wh-lawn-super-tease.jpg",
"publishedAt": "2019-03-06T02:59:40Z",
"content": "Washington (CNN)The White House rejected a demand from the House Oversight Committee to turn over documents and comply with interviews concerning the security clearances of some of President Donald Trump's closest advisers, including Trump senior adviser and … [+3261 chars]"
}
]
}
Search all recent articles at CNN
GET
https://newsapi.org/v2/everything?sources=cnn&apiKey=645a1d50c742457c82c06ee4fedf1bae
{
"status": "ok",
"totalResults": 6059,
-"articles": [
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Janet DiGiacomo and Madison Park, CNN",
"title": "Homeless man and the woman in viral good Samaritan story plead guilty to federal charges",
"description": "It was a feel-good story that got people to open their wallets and donate.",
"url": "https://www.cnn.com/2019/03/06/us/gofundme-scam-homeless-man/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/171124082048-homeless-veteran-johnny-bobbitt-super-tease.jpg",
"publishedAt": "2019-03-07T01:19:22Z",
"content": null
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Roxanne Jones",
"title": "With R. Kelly, Gayle King delivers master class in de-escalation and dogged journalism",
"description": "As she calmly questioned an agitated R. Kelly, the CBS anchor demonstrated the courage and code-shifting required of black women (indeed, of all women) every day -- and in the process gave viewers an unfiltered look at her interview subject, writes Roxanne Jo…",
"url": "https://www.cnn.com/2019/03/06/opinions/gayle-king-r-kelly-roxanne-jones/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306114230-01-r-kelly-gayle-king-interview-super-tease.jpg",
"publishedAt": "2019-03-07T01:11:51Z",
"content": "Roxanne Jones, a founding editor of ESPN Magazine and former vice president at ESPN, has been a producer, reporter and editor at the New York Daily News and The Philadelphia Inquirer. Jones is co-author of \"Say it Loud: An Illustrated History of the Black Ath… [+6078 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Tom Page, CNN",
"title": "Expo 2020 Dubai plans to bring sustainable architecture home",
"description": "Before air con, Emiratis had other ways of keeping cool. Now traditional architecture methods are returning to Dubai with Expo 2020.",
"url": "https://www.cnn.com/style/article/dubai-expo-2020-pavilions-sustainability/index.html",
"urlToImage": "http://cdn.cnn.com/cnnnext/dam/assets/190225170438-austria-pavilion-dubai-expo-2020-1-super-tease.jpg",
"publishedAt": "2019-03-07T01:03:16Z",
"content": "When the mercury soars in Dubai, the thought of living without air con is enough to make anyone break out in cold sweats. \r\nBut keeping cool comes at a cost. During the summer months air conditioning is responsible for 60% of peak electricity demand in Dubai,… [+5424 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Amanda Jackson, CNN",
"title": "The gray wolf may soon lose endangered species protection",
"description": "The US Fish and Wildlife Service will soon propose a rule to remove the gray wolf from the endangered species list in the continental United States, US Interior Secretary David Bernhardt announced Wednesday.",
"url": "https://www.cnn.com/2019/03/06/us/gray-wolf-endangered-species-delisting-proposal-trnd/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306174705-gray-wolf-endangered-species-list-super-tease.jpg",
"publishedAt": "2019-03-07T00:56:26Z",
"content": "(CNN)The US Fish and Wildlife Service will soon propose a rule to remove the gray wolf from the endangered species list in the continental United States, US Interior Secretary David Bernhardt announced Wednesday.\r\n\"Recovery of the gray wolf under the Endanger… [+2711 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Kate Bennett, CNN",
"title": "Melania Trump pushes 'Be Best' even without the spotlight",
"description": "It's been almost one year since first lady Melania Trump launched her official \"Be Best\" platform, a three-pillared program set to tackle the relatively vast topics of children's well-being, online behavior and how the opioid crisis affects kids and families.",
"url": "https://www.cnn.com/2019/03/06/politics/melania-trump-be-best-microsoft/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306160217-melania-trump-be-best-super-tease.jpg",
"publishedAt": "2019-03-07T00:50:52Z",
"content": "(CNN)It's been almost one year since first lady Melania Trump launched her official \"Be Best\" platform, a three-pillared program set to tackle the relatively vast topics of children's well-being, online behavior and how the opioid crisis affects kids and fami… [+11244 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": null,
"title": "Burnett: What more could Cohen know that we don't?",
"description": "CNN's Erin Burnett digs into President Trump's former personal attorney Michael Cohen providing the House Intelligence Committee documents showing edits to the false written statement he delivered to Congress in 2017, according to multiple sources familiar wi…",
"url": "https://www.cnn.com/videos/politics/2019/03/06/erin-burnett-monologue-michael-cohen-testimony-house-intelligence-ebof-vpx.cnn",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306191853-ebof-monologue-03062019-super-tease.jpg",
"publishedAt": "2019-03-07T00:47:33Z",
"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Jen Christensen, CNN",
"title": "Climate change gets worse management under Trump, investigation finds",
"description": "The federal government is doing a worse job managing the problem of climate change under President Donald Trump, according to an investigation from the Government Accountability Office that included climate change on its High Risk List report on Wednesday.",
"url": "https://www.cnn.com/2019/03/06/health/trump-climate-change-worse-scn/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/171030083742-co2-climate-change-super-tease.jpg",
"publishedAt": "2019-03-07T00:45:19Z",
"content": "(CNN)The federal government is doing a worse job managing the problem of climate change under President Donald Trump, according to an investigation from the Government Accountability Office that included climate change on its High Risk List report on Wednesda… [+6485 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Priscilla Alvarez, CNN",
"title": "471 parents were deported from US without their children during family separations",
"description": "The Trump administration identified 471 parents who were removed from the United States without their children and \"without being given the opportunity to elect or waive reunification,\" according to the latest court filing in an ongoing lawsuit,",
"url": "https://www.cnn.com/2019/03/06/politics/family-separation-update-immigration-border/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180614143936-family-separation-super-tease.jpg",
"publishedAt": "2019-03-07T00:37:36Z",
"content": null
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Sunlen Serfaty, Clare Foran and Ashley Killough, CNN",
"title": "Timing unclear for House vote to condemn anti-Semitism",
"description": "House Democratic leaders signaled Wednesday that it is now unclear whether a resolution condemning anti-Semitism will come to a vote on the House floor this week.",
"url": "https://www.cnn.com/2019/03/06/politics/house-democrats-antisemitism-resolution-ilhan-omar/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305110228-file-ilhan-omar-super-tease.jpg",
"publishedAt": "2019-03-07T00:32:37Z",
"content": "Washington (CNN)House Democratic leaders signaled Wednesday that it is now unclear whether a resolution condemning anti-Semitism will come to a vote on the House floor this week.\r\nThe uncertainty comes as Democratic lawmakers are engaged in what multiple Demo… [+9218 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
"title": "Here's the best poll # for Donald Trump this year",
"description": "The first two years of Donald Trump's presidency haven't exactly been filled with stellar ratings from the public.",
"url": "https://www.cnn.com/2019/03/06/politics/donald-trump-polling-numbers-economy/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/180202112343-01-trump-0130-super-tease.jpg",
"publishedAt": "2019-03-07T00:31:10Z",
"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "posadasimon",
"title": "La secretaria de Seguridad Nacional, Kirstjen Nielsen, defiende las políticas de inmigración del Gobierno en una dura audiencia",
"description": "Nielsen describió un sistema abrumado en la frontera como resultado de una oleada de migrantes. Nielsen dijo que Estados Unidos está en camino de detener a 900.000 inmigrantes indocumentados en la frontera sur este año.",
"url": "https://cnnespanol.cnn.com/2019/03/06/la-secretaria-de-seguridad-nacional-kirstjen-nielsen-defiende-las-politicas-de-inmigracion-del-gobierno-en-una-dura-audiencia/",
"urlToImage": "https://cnnespanol2.files.wordpress.com/2018/10/fdfdfd1.jpg?quality=100&strip=info&w=1200",
"publishedAt": "2019-03-07T00:13:19Z",
"content": "(CNN) — La secretaria de Seguridad Nacional, Kirstjen Nielsen, y los demócratas de la Cámara de Representantes se enfrentaron este miércoles por las polémicas políticas de inmigración del gobierno de Trump, que provocaron la separación de los niños de sus pad… [+6316 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Ashley Strickland, CNN",
"title": "For possible life on other planets, the more suns the better",
"description": "When looking for planets that might support life in our galaxy and beyond, astronomers are looking for conditions that are just right to create the \"Goldilocks zone.\" This is also called the habitable zone, when a planet is the right distance from its star to…",
"url": "https://www.cnn.com/2019/03/06/world/exoplanets-habitable-zone-binary-stars-scn/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306133740-01-wonders-of-the-universe-super-tease.jpg",
"publishedAt": "2019-03-07T00:13:11Z",
"content": "(CNN)When looking for planets that might support life in our galaxy and beyond, astronomers are looking for conditions that are just right to create the \"Goldilocks zone.\" This is also called the habitable zone, when a planet is the right distance from its st… [+2988 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "merinocnn",
"title": "Alejandra Oraa llevan a la audiencia a nuevos Destinos: Córdoba, Argentina",
"description": "Alejandra Oraa se escapará a un paraíso en Argentina, que dejará a lo televidentes con la boca abierta. Un lugar donde la historia y la cultura conviven con increíbles sabores y ritmos: Córdoba.…",
"url": "https://cnnespanol.cnn.com/2019/03/06/alejandra-oraa-llevan-a-la-audiencia-a-nuevos-destinos-cordoba-argentina/",
"urlToImage": "https://cnnespanol2.files.wordpress.com/2019/03/190304104234-desinos-cordoba-argentina-alejandra-mashup2-00004501-full-169.jpg?quality=100&strip=info&w=1200",
"publishedAt": "2019-03-07T00:01:42Z",
"content": "(CNN Español) — El próximo sábado 9 de marzo a las 9:00 p.m. (Miami), CNN en Español presenta una nueva edición del programa Destinos, el espacio que descubre lo mejor de cada país para dar a conocer su belleza, cultura y tradición.\r\nEn este episodio, Alejand… [+2406 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Caroline Kelly, CNN",
"title": "GOP senator defends mandatory vaccinations after Paul says they're inconsistent with liberty",
"description": "A Republican senator forcefully defended mandatory vaccinations Tuesday after his Republican colleague, Sen. Rand Paul, blasted national vaccination requirements as a danger to liberty.",
"url": "https://www.cnn.com/2019/03/06/politics/rand-paul-bill-cassidy-vaccines/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306164846-senators-bill-cassidy-and-rand-paul-super-tease.jpg",
"publishedAt": "2019-03-07T00:00:34Z",
"content": "(CNN)A Republican senator forcefully defended mandatory vaccinations Tuesday after his Republican colleague, Sen. Rand Paul, blasted national vaccination requirements as a danger to liberty.\r\nSen. Bill Cassidy, of Louisiana, said vaccines are a key public hea… [+3396 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "James Griffiths, CNN",
"title": "'Never a threat to humans': Australian town mourns beloved crocodile shot in the head",
"description": "A town in northern Australia is in mourning this week after a beloved crocodile was found dead.",
"url": "https://edition.cnn.com/2019/03/06/australia/crocodile-australia-bismarck-intl/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190307074950-bismarck-crocodile-tease-only-super-tease.jpg",
"publishedAt": "2019-03-06T23:57:14Z",
"content": "Meunga Creek: Police are appealing for public tip offs, as officers and rangers investigate the death of Cardwell's most well-known crocodile. There are fears the four and a half metre reptile called 'Bismarck' was shot. Credit: Ryan Moody Fishing. #7Newspic.… [+75 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "posadasimon",
"title": "¿Qué hace exactamente Ivanka Trump?",
"description": "Aunque es inusual que un hijo de un presidente sirva en una administración, el rol de Ivanka Trump es familiar para su papá: ella había sido su asesora de confianza durante su juventud como vicepresidenta ejecutiva en la Organización Trump y, en última instan…",
"url": "https://cnnespanol.cnn.com/2019/03/06/que-hace-exactamente-ivanka-trump/",
"urlToImage": "https://cnnespanol2.files.wordpress.com/2017/12/ivanka-trump-1014-super-tease.jpg?quality=100&strip=info&w=1200",
"publishedAt": "2019-03-06T23:48:26Z",
"content": "(CNN) — Ivanka Trump se convirtió en asesora de tiempo completo del presidente en marzo de 2017 después de asesorar informalmente a su padre, Donald Trump, durante los dos primeros meses de su administración.\r\nLos críticos señalan su falta de experiencia en e… [+8410 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Caroline Kelly and Gregory Krieg, CNN",
"title": "Bernie Sanders defends Ilhan Omar against anti-Semitism allegations",
"description": "Democratic presidential candidate Sen. Bernie Sanders on Wednesday defended Rep. Ilhan Omar against the backlash to her comments slamming pro-Israel groups and politicians, which have been called anti-Semitic.",
"url": "https://www.cnn.com/2019/03/06/politics/bernie-sanders-defends-ilhan-omar/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190302135627-04-bernie-sanders-rally-nyc-0302-super-tease.jpg",
"publishedAt": "2019-03-06T23:42:10Z",
"content": "(CNN)Democratic presidential candidate Sen. Bernie Sanders on Wednesday defended Rep. Ilhan Omar against the backlash to her comments slamming pro-Israel groups and politicians, which have been called anti-Semitic.\r\nSanders, who is Jewish, said criticism of O… [+2505 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "Priscilla Alvarez, Geneva Sands and Catherine E. Shoichet, CNN",
"title": "Five takeaways from today's hearings on immigration and family separation",
"description": "Lawmakers grilled several key Trump administration officials over its enforcement of immigration law, including the \"zero tolerance\" policy that led to the separation of migrant children from their parents at the border last year.",
"url": "https://www.cnn.com/2019/03/06/politics/immigration-nielsen-hearing-takeaways/index.html",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306114112-05-nielsen-hrg-0306-restricted-super-tease.jpg",
"publishedAt": "2019-03-06T23:38:01Z",
"content": "Washington (CNN)Across Capitol Hill Wednesday, lawmakers grilled several key Trump administration officials over its enforcement of immigration law, including the \"zero tolerance\" policy that led to the separation of migrant children from their parents at the… [+9053 chars]"
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": "CNN, CNN",
"title": "CNN10 - 3/07/19",
"description": "ISIS loses its grip on the last Syrian village it occupies, families mark 5 years since the disappearance of a passenger plane, and GM closes a plant in Ohio.",
"url": "http://rss.cnn.com/~r/services/podcasting/studentnews/rss/~3/3mbL5cJdc5w/ten-0307.cnn_2496824_ios_1240.mp4",
"urlToImage": null,
"publishedAt": "2019-03-06T23:37:31Z",
"content": null
},
-{
-"source": {
"id": "cnn",
"name": "CNN"
},
"author": null,
"title": "Cohen: It's been a long couple of days",
"description": "President Trump's former personal attorney Michael Cohen speaks with reporters after testifying before the House Intelligence Committee in a closed hearing.",
"url": "https://www.cnn.com/videos/politics/2019/03/06/michael-cohen-house-intelligence-hearing-sot-tsr-vpx.cnn",
"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306174429-michael-cohen-capitol-hill-march-6-cnn-cam-super-tease.jpg",
"publishedAt": "2019-03-06T23:36:49Z",
"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."


public static void main(String[] args) throws Exception{


		List<String> listofid=new ArrayList();
		List<String> listofname=new ArrayList();
		List<String> listofa=new ArrayList();
		List<String> listoft=new ArrayList();
		List<String> listofdes=new ArrayList();
		List<String> listofurl=new ArrayList();
		List<String> listofurlm=new ArrayList();
		List<String> listofpub=new ArrayList();
		List<String> listofcon=new ArrayList();
		Map<String, List<String>>map=new HashMap<>();


		try{
		URL sUrl=new URL("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=645a1d50c742457c82c06ee4fedf1bae");
		URLConnection request=sUrl.openConnection();
		request.connect();

		JsonParser jsonParser=new JsonParser();
		JsonElement root=jsonParser.parse(new InputStreamReader((InputStream)request.getContent()));

		JsonObject jsonObject=new JsonObject();
		jsonObject.add("articles",root);

		JsonArray jsonArray=new JsonArray();
		jsonArray.add(root.getAsJsonObject().get("articles"));


		for(int k=0;k<jsonArray.get(0).getAsJsonArray().size();k++){


		JsonObject jsonobject=jsonArray.get(0).getAsJsonArray().get(k).getAsJsonObject();


		String id=jsonobject.get("source").getAsJsonObject().get("id").toString();
		System.out.print(id);
		listofid.add(id);

		String name=jsonobject.get("source").getAsJsonObject().get("name").toString();
		System.out.print(name);
		listofname.add(name);

		String a=jsonobject.get("author").toString();
		System.out.print(a);
		listofa.add(a);
		String t=jsonobject.get("title").toString();
		System.out.print(t);
		listoft.add(t);
		String des=jsonobject.get("description").toString();
		System.out.print(des);
		listofdes.add(des);
		String url=jsonobject.get("url").toString();
		System.out.print(url);
		listofurl.add(url);
		String urlm=jsonobject.get("urlToImage").toString();
		System.out.print(urlm);
		listofurlm.add(urlm);
		String pub=jsonobject.get("publishedAt").toString();
		System.out.print(pub);
		listofpub.add(pub);
		String con=jsonobject.get("content").toString();
		System.out.print(con);
		listofcon.add(con);
		System.out.println();
		map.put("all_id",listofid);
		map.put("all_name",listofname);
		map.put("all_author",listofa);
		map.put("all_title",listoft);
		map.put("all_description",listofdes);
		map.put("all_url",listofurl);
		map.put("all_urlImage",listofurlm);
		map.put("all_publication",listofpub);
		map.put("all_content",listofcon);


		}


		}catch(Exception e){
		e.printStackTrace();
		}
		for(Map.Entry e:map.entrySet()){
		System.out.println(e.getKey()+" "+e.getValue());
		}
		List l1=listofid;
		List l2=listofname;
		List l3=listofa;
		List l4=listoft;
		List l5=listofdes;
		List l6=listofurl;
		List l7=listofurlm;
		List l8=listofpub;
		List l9=listofcon;

		}
