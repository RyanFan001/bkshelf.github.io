---
layout: default
title: SRS
nav_order: 2
---

# Software Requirement Specification

{: .no_toc }

Looking for a minimal html version of this doc?

[Get it here](./html/srs.html){: .btn .fs-3 .btn-purple }

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

Bookshelf is a media tracking web-based application where users can log different media they have consumed. This document outlines the proposed bookshelf web-based application, its requirements and its goals. The intended audience is our client, David Brown, as well as our development team.

### Scope

This document is an outline of the specifications and description of Bookshelf. This application will act as both a content-management system and a recommendation system. The application will offer a way to organize a collection of media, as well as recommend new personalized content curated for the user.

### Definitions, acronyms, and abbreviations

#### Definitions

**Friends**: Friends can be made by an individual by adding other users they know on bookshelf. They can also be able to see what their friends are currently interested in.

**My Bookshelf**: My Bookshelf contains the collection of media that is curated by the user. My bookshelf can track the status of ongoing media as well as suggest media based on the individual’s interests and likes.

**Registered User**: A user who has created an account and has logged in.

**User**: An individual who accesses the website.

**User Profile**: An individual’s directory of stored personal user settings and information related to the user. The personal profile provides functionality such as a list of tracking and storing media collections.

#### Acronyms and Abbreviations

**API**: Application Program Interface. External software packages used in building this application.

**GUI**: Graphical User Interface. This is the interactive visual component for the software in which the user interacts. Ultimately consists of actions such as traditional buttons and information.

**SRS**: Software Requirements Specifications. This is the document that contains all requirements that describes the functionality the product needs to fulfill all stakeholders needs.

### References

- [IEEE SRS](https://bohr.wlu.ca/cp317/notes/IEEE_830.pdf)

### Overview

This SRS document is divided into four sections. Introduction, overall description, specific requirements, and supporting information. These are followed in order and each have their appropriate subsections. A table of contents is provided in supporting information for further information on the SRS layout.

## Overall description

### Product perspective

<div style="width: 960px; height: 720px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:960px; height:720px" src="https://lucid.app/documents/embeddedchart/b804fb86-8146-4aba-9d18-0a6c67ef5768" id="Ac5aK6oe3PoK"></iframe></div>

### Product functions

- Create and modify lists of mixed media (i.e. books, movies, tv, etc.) content

- Track progress of media (i.e. tv show progress)

- View a list of recommended media based on user’s lists

- Rate media (i.e. likes, dislikes, stars, etc.) upon completion and during

- Personal journal notes upon completion of a media series (i.e. tv show, book series) or one off content (i.e. movie without sequels, etc.)

- Add and manage friend pages along with viewing friends public lists

### User Characteristics

<div style="width: 640px; height: 480px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:640px; height:480px" src="https://lucid.app/documents/embeddedchart/9fb186f5-9073-491c-982a-7b2a1958a848" id="UZgb.l-c_KT~"></iframe></div>

The users of bookshelf will be of all ages, most forms of media will be included such as books, T.V. shows, recipes, etc. This wide range will maintain interest from users regardless of interest. Since bookshelf will be an online application, anyone with access to the internet will be able to create a profile. Experience on computers will not matter as bookshelf will be set up with the same vocabulary as websites such as Facebook, there should be no trouble setting up an account and profile.

### Constraints

The project includes development constraints. For example, time constraints and project reliability. We need to finish by the end of the semester on April 12, 2021. Then, there is no cost constraint for bookshelf as we will be using free software to implement the web-based application.

### Assumptions and dependencies

It is assumed that all of our users have a functioning web-capable device with a browser which is able to connect with a network in order to log in to our web-based application. This application should function on any operating system.

## Specific Requirements

### External interfaces

- The genre of a media resource entered by the user is used as a filter to find relevant resources.

- There is a friend list where users can add and communicate with friends or other users of the site.

- After users searched a specific resource they are able to see comments provided by other users and leave their own comments.

### Functions

- Clicking the login button gives the user the option to log in, register an account, or reset their password if they have forgotten it

- Any capital letters entered by the users for searching resources are changed to small letters and spaces are removed to simplify searching. For example, "City Lights'' is compared as "citylights", and therefore are matched.

- The system shall ensure that when a user attempts to create a comment they have the option to choose whether anonymous or not.

## Authors

| Name             | Date       | Description                            |
| :--------------- | :--------- | :------------------------------------- |
| Grant Westerholm | 2021-02-10 | introduction                           |
| Hayden Coulter   | 2021-02-10 | user characteristics                   |
| Michael Hoang    | 2021-02-10 | product perspective, product functions |
| Wei Li           | 2021-02-10 | external interfaces, functions         |
