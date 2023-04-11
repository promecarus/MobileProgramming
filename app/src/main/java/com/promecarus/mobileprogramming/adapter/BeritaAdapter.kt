package com.promecarus.mobileprogramming.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bumptech.glide.Glide
import com.promecarus.mobileprogramming.data.Berita
import com.promecarus.mobileprogramming.databinding.ItemListBeritaBinding

class BeritaAdapter(
    private val context: Context,
    private val dataSource: ArrayList<Berita>
) : BaseAdapter() {
    private val inflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding: ItemListBeritaBinding
        val view: View

        if (convertView == null) {
            binding = ItemListBeritaBinding.inflate(inflater, parent, false)
            view = binding.root
            view.tag = binding
        } else {
            binding = convertView.tag as ItemListBeritaBinding
            view = convertView
        }

        val itemBerita = getItem(position) as Berita

        binding.beritaJudul.text = itemBerita.judul
        binding.beritaDeskripsi.text = itemBerita.deskripsi
        Glide
            .with(context)
            .load(itemBerita.gambar)
            .centerCrop()
            .into(binding.beritaGambar)

        return view
    }

}
