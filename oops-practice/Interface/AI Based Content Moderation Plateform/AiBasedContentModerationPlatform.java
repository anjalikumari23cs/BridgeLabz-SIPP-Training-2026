interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Moderation Policy: No offensive content allowed.");
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displaySpamPolicy() {
        System.out.println("Spam Policy: No spam content allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean isOffensive(String post) {
        // Example logic: check for offensive words
        return post.contains("offensive") || post.contains("inappropriate");
    }

    @Override
    public boolean isSpam(String post) {
        // Example logic: check for spam indicators
        return post.contains("spammywebsite.com") || post.contains("cheap products");
    }

    public static boolean containsRestrictedWords(String post) {
        // Example logic: check for restricted words
        return post.contains("restricted") || post.contains("prohibited");
    }
}

public class AiBasedContentModerationPlatform {
    public static void main(String[] args) {
        String[] posts = {
                "This is a valid post.",
                "Buy cheap products at spammywebsite.com!",
                "This post contains offensive language.",
                "Another valid post."
        };

        ContentModerator moderator = new ContentModerator();

        for (String post : posts) {
            System.out.println("Post: " + post);
            if (ContentModerator.containsRestrictedWords(post)) {
                System.out.println("Result: Offensive content detected.");
            } else if (moderator.isSpam(post)) {
                System.out.println("Result: Spam content detected.");
            } else {
                System.out.println("Result: Valid content.");
            }
            System.out.println();
        }

        moderator.displayModerationPolicy();
    }
}
