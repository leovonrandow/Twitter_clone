package com.example.twitter_clone

data class Post(
    var avatar_picture: Int = 0,
    var name: String,
    var nick: String,
    var time_passed: String,
    var message: String,
    var image: Int = 0
)