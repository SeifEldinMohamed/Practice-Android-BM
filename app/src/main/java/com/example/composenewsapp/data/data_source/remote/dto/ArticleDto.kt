package com.example.composenewsapp.data.data_source.remote.dto

import com.example.composenewsapp.domain.model.Article

data class ArticleDto(
    var source      : Source,
    var author      : String,
    var title       : String,
    var description : String,
    var url         : String,
    var urlToImage  : String,
    var publishedAt : String,
    var content     : String
)
