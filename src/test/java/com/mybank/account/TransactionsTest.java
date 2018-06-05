package com.mybank.account;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class TransactionsTest {

    public class Transaction {
        private final Integer id;
        private final String detail;
        private final String type;
        private final Double amount;
        private final LocalDate creationDate;

        public Transaction(Integer id, String detail, String type, Double amount, LocalDate creationDate) {
            this.id = id;
            this.detail = detail;
            this.type = type;
            this.amount = amount;
            this.creationDate = creationDate;
        }

        public Integer getId() { return id; }

        public String getDetail() { return detail; }

        public String getType() { return type; }

        public Double getAmount() { return amount; }

        public LocalDate getCreationDate() { return creationDate; }

        public String toString() {
            return String.format("amount: %s detail=%s (id=%s) at %s", amount, detail, id, creationDate);
        }
    }


    List<Transaction> transactions;

    @Before
    public void setUp() {
        transactions = Arrays.asList(
                new Transaction(1, "shopping", "DEBIT", 15.0, LocalDate.of(2018, 1, 1)),
                new Transaction(2, "shopping", "DEBIT", 10.0, LocalDate.of(2017, 1, 2)),
                new Transaction(3, "sport", "DEBIT", 20.0, LocalDate.of(2018, 5, 3)),
                new Transaction(4, "shopping", "DEBIT", 30.0, LocalDate.of(2017, 5, 4)),
                new Transaction(5, "sport", "DEBIT", 30.0, LocalDate.of(2018, 10, 5)),
                new Transaction(6, "salary", "CREDIT", 10000.0, LocalDate.of(2017, 10, 6)),
                new Transaction(7, "cinema", "DEBIT", 10.0, LocalDate.of(2018, 3, 7)),
                new Transaction(8, "sport", "DEBIT", 5.0, LocalDate.of(2017, 3, 8)),
                new Transaction(9, "shopping", "DEBIT", 5.0, LocalDate.of(2018, 8, 9)),
                new Transaction(10, "blablacar", "CREDIT", 45.0, LocalDate.of(2017, 8, 10)));
    }

    @Test
    public final void should_filter_only_credit_transactions() {
    }

    @Test
    public final void should_sum_debit_transactions() {
    }

}
