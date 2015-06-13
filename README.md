## TimeAgo Utils
A little class that shows when ago that a particular event happened.

## Usage
```java
TimeAgoUtils.timeAgo(new Date());    // Just a short string representation
==> 1s, now, 2s, 1y, 1mo, 1wk

TimeAgoUtils.timeAgo(new Date(), true); // If you want a longer string
==> just now, last year, a week, a month ago, 5 years ago, 3 weeks ago
```

### Who is using it?
We are currently using this in our android app.

![image](img.png)

### Author
Tawheed Raheem (c) 2015