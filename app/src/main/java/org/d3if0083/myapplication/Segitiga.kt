package org.d3if0083.myapplication


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if0083.myapplication.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Segitiga : Fragment() {

    var str = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding : FragmentSegitigaBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_segitiga, container, false)
        // Inflate the layout for this fragment
        binding.bHitungS.setOnClickListener {
            var alas = binding.etAlasS.text.toString().toInt()
            var tinggi = binding.etTinggiS.text.toString().toInt()

            var c = Math.pow(alas.toDouble(), 2.0) + Math.pow(alas.toDouble(), 2.0)
            c = Math.sqrt(c)
            var keliling = alas + tinggi + c
            var luas = (alas*tinggi)/2
            var strS = "Luas : $luas\nKeliling : $keliling"
            binding.tvHasilS.text = strS
            this.str = strS
        }
        binding.bShareS.setOnClickListener {
            val inten = Intent(Intent.ACTION_SENDTO)
            inten.data = Uri.parse("mailto:")
            inten.putExtra(Intent.EXTRA_SUBJECT, "ini subject")
            inten.putExtra(Intent.EXTRA_TEXT,  this.str)
            startActivity(inten)

        }
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }


}
