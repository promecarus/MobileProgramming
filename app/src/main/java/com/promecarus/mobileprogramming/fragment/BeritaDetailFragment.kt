package com.promecarus.mobileprogramming.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.promecarus.mobileprogramming.databinding.FragmentBeritaDetailBinding

class BeritaDetailFragment : Fragment() {
    private lateinit var binding: FragmentBeritaDetailBinding
    private var judul: String? = null
    private var gambar: String? = null
    private var isi: String? = null
    private var link: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            judul = it.getString(ARG_JUDUL)
            gambar = it.getString(ARG_GAMBAR)
            isi = it.getString(ARG_ISI)
            link = it.getString(ARG_LINK)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBeritaDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.beritaDetailJudul.text = judul
        Glide
            .with(this)
            .load(gambar)
            .centerCrop()
            .into(binding.beritaDetailGambar)
        binding.beritaDetailIsi.text = isi
        binding.beritaDetailLink.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
        }
    }

    companion object {
        private const val ARG_JUDUL = "judul"
        private const val ARG_GAMBAR = "gambar"
        private const val ARG_ISI = "isi"
        private const val ARG_LINK = "link"

        @JvmStatic
        fun newInstance(judul: String, gambar: String, isi: String, link: String) =
            BeritaDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_JUDUL, judul)
                    putString(ARG_GAMBAR, gambar)
                    putString(ARG_ISI, isi)
                    putString(ARG_LINK, link)
                }
            }
    }
}
