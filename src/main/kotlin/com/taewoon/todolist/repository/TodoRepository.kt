package com.taewoon.todolist.repository

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository :JpaRepository<Todo,Long>