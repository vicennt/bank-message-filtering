/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.logic;

/**
 *
 * @author vicent
 */
public interface INapierBankService {
    void addSortCodeSIRList();
    void addNatureIndidentSIRList();
    void addHashtagsHTList();
    void addMentionsMTList();
    void newMessage();
    void loadMessages();
}
