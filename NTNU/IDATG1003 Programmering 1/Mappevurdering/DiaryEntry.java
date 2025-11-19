package edu.ntnu.iir.bidata;

import java.time.LocalDateTime;

/**
 * This class creates a diary entry that will contain information about:
 * - the title of the diary entry.
 * - the author who made the entry.
 * - the content of the diary entry.
 * - when it was made.
 * - the last time it was modified.
 * The class has methods and accessors with
 */

public class DiaryEntry { // Creating the class DiaryEntry

  private String title; // The title of the diary entry as a text - datatype: String (text value).
  private String author; // Name of the author - datatype. String (text value).
  private String content; // The meals - datatype: String (text value).
  private final LocalDateTime timeCreated; // When the entry was made using LocalDateTime.
  private LocalDateTime timeModified; // When the entry was modified using LocalDateTime.

  /**
   * Method.
   */
  public DiaryEntry(String t, String a, String c) {
    this.title = t; // Creates a local variable
    this.author = a;
    this.content = c;
    this.timeCreated = LocalDateTime.now();
  }

  /**
   * Method.
   */
  public static void fakeEntry() { // Creates a fake instance of the class fakeEntry{
    DiaryEntry fakeEntry = new DiaryEntry("Dinner", "Karl Hansen", "Tacos");
    System.out.println("Title: " + fakeEntry.title);
    System.out.println("Author: " + fakeEntry.author);
    System.out.println("Meal: " + fakeEntry.content);
  }

  /**
   * Method.
   */
  public static void emptyFakeEntry() {
    DiaryEntry emptyFakeEntry = new DiaryEntry("", "", "");
    System.out.println("test");
  }

  // Accessors
  /**
   * Accessor method that returns the title.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Accessor method that returns the author.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Accessor Method that will return the content.
   */
  public String getContent() {
    return content;
  }

  /**
   * Mutator method that will set a title value of the type String.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Mutator method that will set a content value of the type String
   */
  public void setContent(String content) {
    this.content = content;
  }
}
