package nikitagorbatko.example.testnews.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import nikitagorbatko.example.testnews.R
import nikitagorbatko.example.testnews.retrofit.Article


class NewsAdapter: RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private val articlesCopy = ArrayList<Article>()

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.image)
        val title: TextView = view.findViewById(R.id.text_title)
        val description: TextView = view.findViewById(R.id.text_description)

    }

    fun add(new: List<Article>?) {
        if (new != null) {
            articlesCopy.addAll(new)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = articlesCopy[position]
        try {
            Picasso.get().load(article.urlToImage).into(holder.image)
        } catch (ex: IllegalArgumentException) {

        }
        holder.itemView.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(article.url))
            startActivity(holder.image.context, browserIntent, null)
        }
        holder.title.text = article.title
        holder.description.text = article.description
    }

    //TODO diffutil

    override fun getItemCount(): Int = articlesCopy.size
}





