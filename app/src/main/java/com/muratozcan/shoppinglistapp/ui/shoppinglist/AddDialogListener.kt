package com.muratozcan.shoppinglistapp.ui.shoppinglist

import com.muratozcan.shoppinglistapp.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}