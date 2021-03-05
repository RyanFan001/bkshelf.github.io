---
layout: default
title: Analysis
nav_order: 2
---

# Analysis

{: .no_toc }

Looking for a minimal html version of this doc?

[Get it here](./html/analysis.html){: .btn .fs-3 .btn-purple }

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

### Project Overview

Bookshelf is a web-based application that allows users to track and store the status of their personal collection of media content.

### Purpose

This document will thoroughly go through the analysis needed for Bookshelf and will describe all of its features and how they will function.

### Audience

The intended audience for this document will be the client (David Brown) and the project team. They will use this document in order to understand the basis and overall analysis of Bookshelf.

## Object Classification

### Object Diagram

<div style="width: 640px; height: 480px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:640px; height:480px" src="https://lucid.app/documents/embeddedchart/d5ce50fb-e05c-4e84-8070-f86c09a8255f" id="dfhhFYhYwXIS"></iframe></div>

### Entity Objects

**Shelf**: The collection of media that is curated by the user
**User**: A user of the Bookshelf web application
**Media**: A piece of media that could be added to bookshelf collection

### Control Objects

**ContentController**: Coordinates all activities related to searching for different media
**UserController**: Coordinates all matters related to user data
**MediaController**: Coordinates all activities related to Media objects

### Boundary Objects

**ShelfSearchView**: Where a User searches for media and sees the results of the search
**ShelfRecommendView**: Where a User sees the result of recommended content
**ShelfCatalogView**: Where a User sees the collection of media
**MediaEditView**: Where a User modifies existing media in the catalog
**MediaCreateView**: Where a User adds media to the catalog
**MediaDetailsView**: Where a User views information relevant to the media
**UserInfoView**: Where a User can view account information
**UserRegisterView**: Where a User creates their account
**UserLoginView**: Where a User logs in to their account

## State Diagram

<div style="width: 640px; height: 480px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:640px; height:480px" src="https://lucid.app/documents/embeddedchart/3c821db4-7c4f-4bb9-ad42-1d96ed54cbfd" id="kMjhrn.OycPd"></iframe></div>

## Classes

<div style="width: 640px; height: 480px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="0" style="width:640px; height:480px" src="https://lucid.app/documents/embeddedchart/3d886f90-b445-413d-a64a-2b15c73b138e" id="C.jhQHhBjf9d"></iframe></div>

## Authors

| Name          | Date       | Description                                     |
| :------------ | :--------- | :---------------------------------------------- |
| Erica Ancajas | 2021-03-01 | introduction, entity objects                    |
| Wei Li        | 2021-03-01 | boundary objects, control objects               |
| Michael Hoang | 2021-03-01 | object diagram, state diagram, boundary objects |
| Nick Liu      | 2021-03-01 | class diagram                                   |
| Erica Ancajas | 2021-03-01 | SQA                                             |
| Michael Hoang | 2021-03-01 | snapshot-0.1.0 for analysis deliverable         |
