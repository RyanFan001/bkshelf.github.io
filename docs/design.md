---
layout: default
title: Design
nav_order: 2
---

# Design

{: .no_toc }

Looking for a minimal html version of this doc?

[Get it here](./html/design.html){: .btn .fs-3 .btn-purple }

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. TOC
{:toc}
</details>

---

## Introduction

### Purpose

This design document will describe the structure and the collection of documents and resources that describe the architecture and system design of Bookshelf.

### Scope

The target audience of this document are the developers. This document serves as an auxiliary tool for the development room to understand all the requirements of Bookshelf.

### Reference

- Software Requirements Specification document for Bookshelf
- Analysis document for Bookshelf
- IEEE Recommended Practice for Software Design Descriptions

### Overview

This document is written regarding IEEE Recommended Practice for Software Design Descriptions. It describes the necessary information content and recommendations for the organization of the software design specification (SDD-a representation of the software system) as a medium to convey software design information and is suitable for paper documents.

## System Overview

## Decomposition Description

### Module Decomposition

#### Framework Packages Interactions

![Framework Packages](/images/framework-packages.png)

#### Bookshelf Model Class Diagram

<!-- ![Class Diagram](/images/class-diagram.png) -->

<div style="width: 640px; height: 480px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:640px; height:480px" src="https://lucid.app/documents/embeddedchart/3d886f90-b445-413d-a64a-2b15c73b138e" id="C.jhQHhBjf9d"></iframe></div>

## Interface Descriptions

### Colour Guidelines & Iconography

![Design Details](/images/screens/details.png)

### Module Interface

#### Onboarding Screens

![Onboard](/images/screens/onboard-1.png)

| Field         | Type       | Description                                       |
| :------------ | :--------- | :------------------------------------------------ |
| nameInput     | Text Field | Name of the user to create                        |
| emailInput    | Text Field | Email of the user                                 |
| passwordInput | Password   | Password for the user                             |
| signInButton  | Button     | Uses name, email, and password to create new user |
| logInButton   | Button     | Uses email and password to log in to user         |

| Identification   | Purpose                               |
| :--------------- | :------------------------------------ |
| UserRegisterView | An account creation page for the user |
| UserLoginView    | A login page for the user             |

#### Home Screens

![Home](/images/screens/home.png)

| Field                    | Type                          | Description                                                                                                                   |
| :----------------------- | :---------------------------- | :---------------------------------------------------------------------------------------------------------------------------- |
| viewAllRecommendedButton | Button                        | Displays the RecommendView                                                                                                    |
| mediaCardVertical        | Card (Div)                    | Contains the cover, title, and creator name. Links to SearchMediaDetailsView.                                                 |
| mediaCardHorizontal      | Card (Div)                    | Contains the cover, title, creator name, and description. Links to SearchMediaDetailsView.                                    |
| navBottom                | Navigation (Button)           | Navigate between ShelfHomeView, ShelfSearchView, ShelfView, and UserInfoView                                                  |
| searchBar                | Search (Div + Input + Select) | Displays ShelfSearchView and sends request to the correct external APIs with the dropdown selection for different media types |
| userProfileIcon          | Icon                          | Links to UserInfoView                                                                                                         |
| recommendedCarousel      | Div                           | Container of mediaCardVertical items, scrolls left and right                                                                  |
| welcomeMessage           | Label                         | Displays the users name                                                                                                       |

| Identification | Purpose                                                                                   |
| :------------- | :---------------------------------------------------------------------------------------- |
| HomeView       | Allows user to quickly search media items, see recommend items, and open the user profile |
| RecommendView  | Contains a list recommended media items (mediaCardHorizontal)                             |

#### Shelf Screens

![Shelf](/images/screens/shelf.png)

| Field                 | Type                | Description                                                                  |
| :-------------------- | :------------------ | :--------------------------------------------------------------------------- |
| navBottom             | Navigation (Button) | Navigate between ShelfHomeView, ShelfSearchView, ShelfView, and UserInfoView |
| addNewMediaButton     | Button              |                                                                              |
| mediaCardHorizontal   | Card (Div)          |                                                                              |
| mediaType             | Select              |                                                                              |
| mediaTitleInput       | Button              |                                                                              |
| mediaCreatorInput     | Input               |                                                                              |
| mediaRating           | Rating (Div)        |                                                                              |
| notesTextInput        | Text Field          |                                                                              |
| confirmNewMediaButton | Button              |                                                                              |
| cancelNewMediaButton  | Button              |                                                                              |

| Identification   | Purpose                                                                                                            |
| :--------------- | :----------------------------------------------------------------------------------------------------------------- |
| ShelfCatalogView | Displays a list of media that the user has added.                                                                  |
| MediaCreateView  | Allows users to add a custom media item.Adding a new media item will attempt to pull cover art from external APIs. |

#### Profile Screens

![Profile](/images/screens/profile.png)

| Field              | Type                | Description                                                                  |
| :----------------- | :------------------ | :--------------------------------------------------------------------------- |
| navBottom          | Navigation (Button) | Navigate between ShelfHomeView, ShelfSearchView, ShelfView, and UserInfoView |
| logoutButton       | Button              | Logs user out and links to UserLoginView                                     |
| iconEditProfile    | Icon (Button)       | Displays user profile picture and clicking allows user to change photo       |
| nameEditButton     |                     |
| mailEditButton     |                     |
| passwordEditButton |                     |

| Identification | Purpose                                               |
| :------------- | :---------------------------------------------------- |
| UserInfoView   | Displays user profile and allows user to edit details |

#### Media Screens

![Media](/images/screens/media.png)

| Field          | Type                | Description                                                                  |
| :------------- | :------------------ | :--------------------------------------------------------------------------- |
| navBottom      | Navigation (Button) | Navigate between ShelfHomeView, ShelfSearchView, ShelfView, and UserInfoView |
| editShelfMedia | Button              | Links to MediaCreateView                                                     |
| notesText      | Text Field          | Displays user notes                                                          |

| Identification         | Purpose                                                                                                                                                                                                                                                                                                                                     |
| :--------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| ShelfMediaDetailsView  | Displays the name, creator, rating and notes of the item. This view is only displayed from clicking a media item from the ShelfCatalogView.                                                                                                                                                                                                 |
| SearchMediaDetailsView | Note: This view is not shown in a screen image. Displays name, creator, and description of media items from the search result. This view is only displayed from clicking a media item that does not exist in the Shelf. This view should contain a button to add the media to the Shelf which can then be viewed from the ShelfCatalogView. |

#### Search Screens

![Search](/images/screens/search.png)

| Field               | Type                          | Description                                                                                                                   |
| :------------------ | :---------------------------- | :---------------------------------------------------------------------------------------------------------------------------- |
| navBottom           | Navigation (Button)           | Navigate between ShelfHomeView, ShelfSearchView, ShelfView, and UserInfoView                                                  |
| searchBar           | Search (Div + Input + Select) | Displays ShelfSearchView and sends request to the correct external APIs with the dropdown selection for different media types |
| mediaCardHorizontal | Card (Div)                    | Contains the cover, title, creator name, and description                                                                      |

| Identification  | Purpose                                                                                                                 |
| :-------------- | :---------------------------------------------------------------------------------------------------------------------- |
| ShelfSearchView | Allows users to search the external apis for media and clicking the mediaCardHorizontal links to SearchMediaDetailsView |

## Detailed Design

### Module Detailed Design

### Design Rationale

## Authors

| Name             | Date       | Description                                            |
| :--------------- | :--------- | :----------------------------------------------------- |
| Yu Wu            | 2021-03-22 | Introduction, Colour Guidelines, Module Interface      |
| Shizhao Yu       | 2021-03-22 | Font Guidelines, Module Interface                      |
| Chunfung Sin     | 2021-03-23 | Module Interface                                       |
| Zongyang Li      | 2021-03-25 |                                                        |
| Grant Westerholm | 2021-03-25 | Class diagram, package interactions                    |
| Michael Hoang    | 2021-03-25 | Interface Descriptions, Module Interface + Screens     |
| Michael Hoang    | 2021-03-25 | snapshot-0.0.1 for testing layout and images (Pre SQA) |
