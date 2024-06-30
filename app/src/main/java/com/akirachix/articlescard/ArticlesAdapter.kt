package com.akirachix.articlescard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter (val articlesList: List<Articles>):RecyclerView.Adapter<ArticlesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.article_item_view,parent,false)
        return ArticlesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ArticlesViewHolder, position: Int) {
        val article= articlesList[position]
        holder.tvAuthor.text=article.author
        holder.tvTitle.text=article.title
        holder.publishingDate.text=article.publishing_date
        holder.articlePreview.text=article.article_preview

    }

    override fun getItemCount(): Int {
     return  articlesList.size
    }
}

class ArticlesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
    var  tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var publishingDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
    var articlePreview=itemView.findViewById<TextView>(R.id.tvPreview)

}
