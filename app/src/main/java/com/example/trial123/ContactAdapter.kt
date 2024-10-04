package com.example.trial123

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class ContactAdapter(context:Context,arrayList:Array<Contact>):
    ArrayAdapter<Contact>(context,0,arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView=convertView

        if(listItemView==null){
            listItemView=LayoutInflater.from(context).inflate(R.layout.singlecontactperson,parent,false)
        }

        val currentContact=getItem(position)!!

        val nameTextView=listItemView!!.findViewById<TextView>(R.id.text_name)
        val phoneTextView=listItemView.findViewById<TextView>(R.id.text_phone)

        nameTextView.text="${currentContact.first_name} ${currentContact.last_name}"
        phoneTextView.text=currentContact.phone

        return listItemView
    }
}