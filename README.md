# The Berlin Clock

The Berlin Uhr (Clock) is a rather strange way to show the time. On the top of the clock there is a yellow lamp that
blinks on/off every two seconds. The time is calculated by adding rectangular com.ubs.opsit.interviews.lamps.
 
The top two rows of com.ubs.opsit.interviews.lamps are red. These indicate the hours of a day. In the top row there are 4 red com.ubs.opsit.interviews.lamps. Every lamp
represents 5 hours. In the lower row of red com.ubs.opsit.interviews.lamps every lamp represents 1 hour. So if two com.ubs.opsit.interviews.lamps of the first row and
three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 
The two rows of com.ubs.opsit.interviews.lamps at the bottom count the minutes. The first of these rows has 11 com.ubs.opsit.interviews.lamps, the second 4. In the
first row every lamp represents 5 minutes. In this first row the 3rd, 6th and 9th lamp are red and indicate the first
quarter, half and last quarter of an hour. The other com.ubs.opsit.interviews.lamps are yellow. In the last row with 4 com.ubs.opsit.interviews.lamps every lamp
represents 1 minute.

One can be seen [here](http://uniqueclocks.co.uk/media/berlin~clock.jpg~1.gif)

## The brief

We have created a number of acceptance tests for the Berlin Clock and your challenge is to get them passing. Additionally, please make sure your solution is accompanied by comments in git commit messages that describe a step-by-step refactorings, so we can understand the way you were thinking.

## Some hints
If you are new to Gradle, it may be worth spending 10 minutes reading a high level summary.  We are using the Gradle
Wrapper so `gradlew` from the command line should download everything you need.  Most modern IDEs support Gradle projects.

The use of JBehave in this instance is to provide you with our definition of done for the task.

Please ensure that you are familiar with our values in the instructions project (available in a separate file you are given). They are important to us!