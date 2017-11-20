# Sentiment-Analysis-MapReduce
Using MapReduce to analyze the article sentiments.

***1. open a new project called SentimentAnalysi in Intellij***
   - 1. create new class called SentimentAnalysis under java file
   - 2. add required dependencies in pom.xml
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
```
SentimentAnalysis/src/main/resources/emotionCategory.txt SentimentAnalysis/src/main/resources/input SentimentAnalysis/src/main/resources/output
```

***3. Run the SentimentAnalysis***

***4. Convert result file into json format*** 
   - 1. Revise Program Arguments as in step 
   - 2. The input path is the path you save the SentimentAnalysis result.
   - 3. Run JSONConverter.java.main()

# Sentimental Visualization
Visualize the sentimental analysis result.

***1. Unzip sentiment-visualization***
   - 1. Replace the generated result.json file into data/result.json.
   - 2. cd to sentiment-visualization in terminal.
```
python3 -m http.server 8000
```
   - 3. input http://localhost:8000/ into browser.
   - The page should like this 
   
   ![Sentiment_visualization](https://github.com/melanthafu/Sentiment-Analysis-MapReduce/blob/master/Sentiment_visualization.PNG)
