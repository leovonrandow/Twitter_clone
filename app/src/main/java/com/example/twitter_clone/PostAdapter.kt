package com.example.twitter_clone

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PostAdapter(var context: Context, var post: List<Post>) : BaseAdapter() {

    override fun getCount(): Int {
        return post.size
    }

    override fun getItem(p0: Int): Any {
//
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view = LayoutInflater.from(context).inflate(R.layout.item_post, null)

        var message = view.findViewById<TextView>(R.id.message)
        message.text = post[position].message

        var avatar_picture = view.findViewById<ImageView>(R.id.avatar)
        avatar_picture.setImageDrawable(context.getDrawable(post[position].avatar_picture))

        var time_passed = view.findViewById<TextView>(R.id.time)
        time_passed.text = post[position].time_passed

        var name = view.findViewById<TextView>(R.id.nome)
        name.text = post[position].name

        var nick = view.findViewById<TextView>(R.id.nick)
        nick.text = post[position].nick

        if(post[position].image > 0) {
            var image = view.findViewById<ImageView>(R.id.imagem)
            image.setImageDrawable(context.getDrawable(post[position].image))
        }
        //var date = view.findViewById<TextView>(R.id.date)
        //date.text = messages[position].date

        var spacing = view.findViewById<View>(R.id.spacing)

        return view
    }

}