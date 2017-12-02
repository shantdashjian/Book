package main;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {
	@NonNull
	private String title;
	@NonNull
	private String author;
	@NonNull
	private boolean read;
}
