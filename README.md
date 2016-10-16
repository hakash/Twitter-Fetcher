# Twitter-Fetcher
An AMQP-message driven microservice project in Java for fetching ratelimited data from Twitter.

##Overview
This is a part of the Twitter Sentiment project, but will be developed for re-use and loosly coupled towards the other parts. This specific microservice will connect to Twitter and fetch the info requested by other services using application and / or user accounts. The service will respect the rate limits set by Twitter, but try to fetch as much info as possible as fast as possible.
