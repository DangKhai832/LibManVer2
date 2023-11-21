package com.example.demo.Controller;



import com.example.demo.Entity.document.BorrowDocument364;
import com.example.demo.Entity.document.Document364;
import com.example.demo.Entity.document.DocumentsByTimeBorrow364;
import com.example.demo.Service.ServiceLibman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ViewReportsController364 {

    @Autowired
    ServiceLibman serviceLibman;

    @GetMapping("/home/manager/viewReport")
    public String getViewReport() {
        return "manager/ViewReportFrm364.html";
    }

    @GetMapping("/home/manager/viewDocumentByTimeBorrow")
    public String viewDocumentByTimeBorrow() {
        return "manager/ViewDocumentsByTimeBorrowFrm364.html";
    }

    @GetMapping("/home/manager/viewTimeBorrowDetail")
    public String viewTimeBorowDetails() {
        return "manager/ViewTimeBorrowDetailsFrm364.html";
    }

    @PostMapping("/viewDocumentsFromDateToDate")
    @ResponseBody
    public List<Document364> viewDocumentsFromDateToDate(@RequestBody DocumentsByTimeBorrow364 obj) {
        return serviceLibman.viewDocumentsFromDateToDate(obj);
    }

    @PostMapping("/getDocumentTransactions")
    @ResponseBody
    public List<BorrowDocument364> getDocumentTransactions(@RequestBody DocumentsByTimeBorrow364 obj) {
        return serviceLibman.getDocumentTransactions(obj);
    }


//    private DocumentsByTimeBorrowDAO364 documentsByTimeBorrowDAO364 = new DocumentsByTimeBorrowDAO364();
//    private BorrowReceiptDAO364 borrowReceiptDAO364 = new BorrowReceiptDAO364();

//    public ViewReportsController364() {
//    }
//
//    @GetMapping("/manager/home")
//    public String getManagerHomePage(HttpSession session) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        return "manager/ManagerHomePageFrm364";
//    }
//
//    @GetMapping("/manager/reports")
//    public String getViewReportsPage(HttpSession session) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        return "manager/ViewReportFrm364";
//    }
//
//    @GetMapping("/manager/reports/documents")
//    public String getViewReportDocumentsPage(HttpSession session) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        return "manager/ViewDocumentsByTimeBorrowFrm364";
//    }
//
//    @PostMapping("/manager/reports/documents")
//    public String viewDocumentsFromDateToDate(HttpSession session, Model model, @RequestParam("fromDate") Date fromDate,
//                                          @RequestParam("toDate") Date toDate) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        ArrayList<DocumentsByTimeBorrow364> documentList = documentsByTimeBorrowDAO364.getDocumentByTimeBorrow(fromDate, toDate);
//        model.addAttribute("fromDate", fromDate);
//        model.addAttribute("toDate", toDate);
//        model.addAttribute("documentList", documentList);
//        return "manager/ViewDocumentsBySalesFrm364";
//    }
//
//    @GetMapping("/manager/reports/document/{documentId}/detail")
//    public String getDocumentTransactions(HttpSession session, Model model, @PathVariable("documentId") int documentId,
//                                          @PathParam("fromDate") Date fromDate, @PathParam("toDate") Date toDate) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        ArrayList<BorrowReceipt364> transactionList = new ArrayList<>();
//        int sumOfQuantity = 0;
//        double sumOfTotal = 0;
//        Document364 document = borrowReceiptDAO364.getDocument(documentId);
////        for (BorrowDocument364 exportItem : exportReceiptDAO.getExportItems(item)) {
////            for (BorrowDocument364 exportOrder : exportReceiptDAO.getExportOrders(exportItem)) {
////                if (exportReceiptDAO.getExportReceipt(exportOrder, fromDate, toDate).getId() > 0) {
////                    transactionList.add(exportReceiptDAO.getExportReceipt(exportOrder, fromDate, toDate));
////                    for (BorrowDocument364 x : exportOrder.getItemList()) {
////                        sumOfQuantity += x.getQuantity();
////                        sumOfTotal += x.getPrice() * x.getQuantity();
////                    }
////                }
////            }
////        }
//        model.addAttribute("fromDate", fromDate);
//        model.addAttribute("toDate", toDate);
//        model.addAttribute("item", document);
//        model.addAttribute("transactionList", transactionList);
//        model.addAttribute("sumOfQuantity", sumOfQuantity);
//        model.addAttribute("sumOfTotal", sumOfTotal);
//        return "manager/ViewSalesDetailsFrm364";
//    }
//
//    @GetMapping("/manager/reports/receipt/{exportReceiptId}")
//    public String getReceiptDetails(HttpSession session, Model model,
//                                    @PathVariable("exportReceiptId") int exportReceiptId) {
//        Object o = session.getAttribute("manager");
//        if (o == null) {
//            return "redirect:/login";
//        }
//        BorrowReceipt364 exportReceipt = borrowReceiptDAO364.getBorrowReceipt(exportReceiptId);
//        model.addAttribute("receipt", exportReceipt);
//        return "manager/ViewReceiptDetailsFrm364";
//    }
}
