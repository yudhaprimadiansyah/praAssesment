package org.d3if0083.myapplication


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if0083.myapplication.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjang : Fragment() {

    var string = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)
        binding.bPersegi.setOnClickListener {
            var panjang = binding.etPanjangP.text.toString().toInt()
            var lebar = binding.etLebarP.text.toString().toInt()

            var luas = panjang*lebar
            var keliling = (panjang*2)+(lebar*2)
            var strHasilP = "Luas : $luas\nKeliling : $keliling"
            binding.tvHasilP.text = strHasilP
            this.string = strHasilP


        }

        binding.bShare.setOnClickListener {
            val inten = Intent(Intent.ACTION_SENDTO)
            inten.data = Uri.parse("mailto:")
            inten.putExtra(Intent.EXTRA_SUBJECT, "Subjek Aja")
            inten.putExtra(Intent.EXTRA_TEXT, this.string)
            startActivity(inten)

        }
        // Inflate the layout for this fragment

       return binding.root
    }


}
