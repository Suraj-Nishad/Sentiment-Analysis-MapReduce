# Sentiment-Analysis-MapReduce
Using MapReduce to analyze the article sentiments.

***1. open a new project called SentimentAnalysi in Intellij***
   - a. create new class called SentimentAnalysis under java file
   - b. add required dependencies in pom.xml
```
    <dependencies>

        <dependency>
            <groupId>org.apache.hadoop</groupId>
            <artifactId>hadoop-core</artifactId>
            <version>1.2.1</version>
        </dependency>
        <dependency>
            <groupId>org.apache.hadoop</groupId>
            <artifactId>hadoop-common</artifactId>
            <version>2.2.0</version>
        </dependency>


    </dependencies>
```

***2. edit configutstions***
    - Revise Program Arguments by adding the input, output paths. Using space to seperate them.
e.g. in this case:
'''
SentimentAnalysis/src/main/resources/emotionCategory.txt SentimentAnalysis/src/main/resources/input SentimentAnalysis/src/main/resources/output
'''

***3. Run the SentimentAnalysis***

***4. Convert result file into json format***
    - Revise Program Arguments as in step 2. The input path is the path you save the SentimentAnalysis result.
