package com.example.demo.Entity.document;

import java.lang.Integer;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblBorrowDocument364")
public class BorrowDocument364 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowDocumentId")
    private Integer borrowDocumentId;

    @Column(name = "documentId")
    private Integer documentId;

    @Column(name = "date")
    private Date date;

    @Column(name = "readerId")
    private Integer readerId;

    @Column(name = "borrowReceiptId")
    private Integer borrowReceiptId;

    public Integer getBorrowDocumentId() {
        return borrowDocumentId;
    }

    public void setBorrowDocumentId(Integer borrowDocumentId) {
        this.borrowDocumentId = borrowDocumentId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getBorrowReceiptId() {
        return borrowReceiptId;
    }

    public void setBorrowReceiptId(Integer borrowReceiptId) {
        this.borrowReceiptId = borrowReceiptId;
    }
}
