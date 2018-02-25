# Project 4: Music App structure
v1.0 Alpha of Music Application project on Udacity

# Description
This project was a chance for me to make the structure of a music app using intents and empty activities. 
The goal was to design and create the structure of a Music app which would allow a user to play audio files.  

The app does not carry any music player activity in itself as the point of the project was to practice the use of
explicit intents in a multiscreen application. As such, the application carries a barebone UI, carrying only the UI elements and 
navigation to drawer menu and tabs / activities related to information such as album / song list and a playlist.

This project is about combining various ideas and skills we’ve been practicing throughout the course. They include:
- Designing an app experience to achieve a certain goal.
- Creating new activities.
- Using explicit Intents to link between activities in our app.
- Using OnClickListeners to add behavior to buttons using Java code.

# Requirements
The design must include:
- App Design:
  - The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.
  - Each activity is clearly labeled, using a TextView, such that the final purpose of such an activity is easy to understand. For instance, one screen might be labeled ‘song detail screen’ and another might be labeled ‘music library’.
  - The app must contain a Payment Activity. The student should find an external library or API that can be used in this situation. In the TextView of that activity, describe the library or API and how it can be used. Any other Activity that requires an external library or class not yet covered also includes the name of that library or class.
  - The app contains 3 to 6 activities.
- Layout:
  - The app contains multiple activities, each labeled, which together make a cohesive music app. 
  - Each activity contains a TextView which explains the purpose of the activity. 
  - Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘Library’ activity might contain a button to move to the ‘Now Playing’ activity. 
  - The code adheres to all of the following best practices:
    - Text sizes are defined in sp
    - Lengths are defined in dp
    - Padding and margin are used appropriately, such that the views are not crammed up against each other.
- Functionality:
  - The code runs without errors.
  - Each button’s behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.
  - Each button properly opens the intended activity using an explicit Intent. 
- Code Readability:
  - The code is properly formatted:
    - No unnecessary blank lines
    - No unused variables or methods
    - No commented out code
  - The code is easily readable such that a fellow programmer can understand the purpose of the app.
  - All variables, methods, and resource IDs are descriptively named such that another developer reading the code can easily understand their function. The code also has proper indentation when defining variables and methods.

# Screenshots
[Screenshot 1](https://drive.google.com/open?id=1g4SgupAb7f_D-hinKWxoM-3RIGJhz5DK) | 
[Screenshot 2](https://drive.google.com/open?id=1hLbpsWrFozhslqsx2EDn2eDK-6fz7hz8) | 
[Screenshot 3](https://drive.google.com/open?id=1LHKsatBx_Ba6OdkXPM1QiPboElQgwzV9) | 
[Screenshot 4](https://drive.google.com/open?id=11gTo4gr7PovaKK0zVvPDnrhsilQS9stT)

# Video
- Video presentation of v1.0 of the application:
[![ScreenShot](https://lh3.googleusercontent.com/Bi7vRUAbBu3gWBnXIjuwuAE1eHQg5XgOgeI2ElAzJ5iD5awMyZoDt7XAGXqbHy-G18ofnINWd_Tg4iaickQB=w1920-h959)](https://youtu.be/JQf6yG1ln3I)
