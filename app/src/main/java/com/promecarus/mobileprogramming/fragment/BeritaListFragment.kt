package com.promecarus.mobileprogramming.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.promecarus.mobileprogramming.R
import com.promecarus.mobileprogramming.Tugas05FragmentListActivity
import com.promecarus.mobileprogramming.adapter.BeritaAdapter
import com.promecarus.mobileprogramming.data.Berita
import com.promecarus.mobileprogramming.data.DataBerita
import com.promecarus.mobileprogramming.databinding.FragmentBeritaListBinding

class BeritaListFragment : Fragment() {
    private lateinit var binding: FragmentBeritaListBinding
    private var beritaList: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBeritaListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (beritaList.isEmpty()) {
            beritaList.addAll(DataBerita.listData)
        }
        binding.listView.adapter = BeritaAdapter(requireContext(), beritaList)
        binding.listView.setOnItemClickListener { parent, _, position, _ ->
            val berita = parent.getItemAtPosition(position) as Berita
            val detail = BeritaDetailFragment.newInstance(
                berita.judul,
                berita.gambar,
                berita.isi,
                berita.link
            )
            (requireActivity() as Tugas05FragmentListActivity).supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout, detail)
                .addToBackStack(null)
                .commit()
        }
    }
}
