# VBoard
Virtual Classroom Application


<p><img src="https://www.pngarts.com/files/7/Online-Learning-PNG-Pic.png" alt="logo" width="20%" /></p>
<p>
    <h1>Virtual Classroom Android Applicattion</h1>
</p>


<p>
Virtual Classroom: allowing students and instructors to share notes and interact
with one another using android phone
</p>

<!-- # Color Calendar
![npm](https://img.shields.io/npm/v/color-calendar?style=flat-square)
![npm](https://img.shields.io/npm/dw/color-calendar?style=flat-square)
![npm bundle size](https://img.shields.io/bundlephobia/min/color-calendar?style=flat-square)
[![](https://data.jsdelivr.com/v1/package/npm/color-calendar/badge)](https://www.jsdelivr.com/package/npm/color-calendar)
![HitCount](http://hits.dwyl.com/PawanKolhe/color-calendar.svg)
![NPM](https://img.shields.io/npm/l/color-calendar?style=flat-square) -->

![Color Calendar](https://d1e4pidl3fu268.cloudfront.net/97b06b69-8c41-48f7-9341-99814ec96885/VirtualClassroom16.png)

- [Features](#features)
- [Getting Started](#getting-started)
  - [CDN](#cdn)
  - [NPM](#npm)
- [Usage](#usage)
  - [Basic](#usage-basic)
  - [React](#usage-react)
  - [Vue](#usage-vue)
- [Options](#options)
- [Events](#events)
- [Methods](#methods)
- [Types](#types)
- [Themes](#themes)
- [Bug Reporting](#bug)
- [Feature Request](#feature-request)
- [Release Notes](#release-notes)
- [License](#license)

<a id="features"></a>

## 🚀 Features

- Allowing students and instructors to share notes and interact with one another using android phone
- Used FIREBASE storage to store PDF and Notes
- FIREBASE authentication to register and login account.
- FIREBASE real time database to create and join CLASS.
- [Request more features](#feature-request)...

<a id="getting-started"></a>

## 📦 Getting Started

###Interfaces

1. Landing
   - Seamless landing page with `Login with Email and Password` button for user Login using Firebase Authentication 
   - ![image](https://user-images.githubusercontent.com/85586404/205280957-9eb3900b-6a14-438e-90ce-2387494d9959.png)
 
   - Not Registered Yet? Click On "Not Registered Yet?" button and register yourself by entering your details
   - ![image](https://user-images.githubusercontent.com/85586404/205281019-be9adaa1-a883-46f1-9943-6fb63013f95d.png)
  

2. Home page 
   - Has a CREATE and JOIN class button for creating class or joining one if you have the credentials
   - ![image](https://user-images.githubusercontent.com/85586404/205281609-9ab0cb12-3c37-4e1b-9357-27e342e4cac7.png)
 
 
3. Create Class
   - Create a room and invite people to join by copying the class code
   - ![WhatsApp Image 2022-12-02 at 16 55 37](https://user-images.githubusercontent.com/85586404/205282508-0587f292-ac60-484e-9338-03107af6baa9.jpg)

4. Join Class
   - Enter the copied Class ID in a form and join the room with your batch mates
   - ![image](https://user-images.githubusercontent.com/85586404/205282305-6046c054-dd49-433c-975d-1015049e0e79.png)

5. Upload PDF FILES
   - Share Notes and PDF files with your batch mates 
   - ![image](https://user-images.githubusercontent.com/85586404/205282885-043955c9-052c-4f9f-9a82-be937f2765ee.png)


## Points to remember while testing the app

1. Allow **permissions** for camera and mic
2. In case any **user is not broadcasted** it is probably due to server overload, **REFRESH** the window to solve this. 
3. Make sure the **URL** is starting with https
4. While **scheduling a meet** make sure the start and end date follow a logical sequence or else it’ll show an error. 
5. While testing the **Posture** bot, allow permissions for the camera and allow **notifications**, and **REFRESH** the page for changes to take effect. 
6. Wait for the model to analyze, and check for **notifications** 


## Instructions


1. `git clone https://github.com/Apurva-tech/unite.git` 
2. `cd ./unite`
3. Install node dependencies 
   - `npm install`
4. Replace firebase API keys with your configurations
5. Create a `.env` file 
   - Add relevant credentials
   - `cp .env.example .env` 
5. `npm run dev`
6. The app is now running at http://localhost:3030/landing 


## Useful Links

- [Deployed Website](https://unite-apurva.herokuapp.com/landing)
- [Demo Video](https://youtu.be/OKKK1GOnlIU)
- [Sprint Document](https://docs.google.com/presentation/d/11k8pLJPEV-XJwxIX4ysW9fKmHqFEZHcUWizFcFyVsns/edit?usp=sharing)
- [Design Document](https://docs.google.com/document/d/1IJcEbbhsbQna-tgcnfV_9_RhXQi4SURlrl3-0HypArE/edit?usp=sharing)

## Need help?

Feel free to contact me on [LinkedIn](https://www.linkedin.com/in/apurva866/) 

[![Instagram](https://img.shields.io/badge/Instagram-follow-purple.svg?logo=instagram&logoColor=white)](https://www.instagram.com/mind.wrapper/) [![Twitter](https://img.shields.io/badge/Twitter-follow-blue.svg?logo=twitter&logoColor=white)](https://twitter.com/mindwrapper) [![Medium](https://img.shields.io/badge/Medium-follow-black.svg?logo=medium&logoColor=white)](https://medium.com/@apurva866)

---------

```javascript

if (youEnjoyed) {
    starThisRepository();
}

```

-----------
