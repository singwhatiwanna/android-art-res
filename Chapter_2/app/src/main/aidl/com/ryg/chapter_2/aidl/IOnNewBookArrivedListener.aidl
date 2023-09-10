package com.ryg.chapter_2.aidl;

import com.ryg.chapter_2.aidl.Book;

interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}
