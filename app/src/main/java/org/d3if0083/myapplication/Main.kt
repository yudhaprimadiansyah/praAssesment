package org.d3if0083.myapplication


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0083.myapplication.databinding.FragmentMainBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindingMain : FragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        bindingMain.bPersegiPanjang.setOnClickListener {
            it.findNavController().navigate(R.id.action_main_to_persegiPanjang)
        }
        bindingMain.bSegitiga.setOnClickListener {
            it.findNavController().navigate(R.id.action_main_to_segitiga)
        }

        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return bindingMain.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }


}
