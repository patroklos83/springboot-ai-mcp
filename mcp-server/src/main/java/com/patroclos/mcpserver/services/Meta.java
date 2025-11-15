package com.patroclos.mcpserver.services;

import lombok.Data;

@Data
public class Meta {
    private int totalItems;
    private int itemCount;
    private int itemsPerPage;
    private int totalPages;
    private int currentPage;
}
