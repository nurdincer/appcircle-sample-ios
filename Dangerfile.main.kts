import systems.danger.kotlin.*
import java.io.File

danger(args) {
    // Simple test Dangerfile
    
    message("✅ Danger is working!")
    message("📁 Current directory: ${File(".").absolutePath}")
    
    // Show git information
    message("🔀 Modified files: ${git.modifiedFiles.joinToString(", ")}")
    message("➕ Added files: ${git.createdFiles.joinToString(", ")}")
    message("➖ Deleted files: ${git.deletedFiles.joinToString(", ")}")
    
    // Show some stats
    message("📊 Lines added: ${git.insertions}")
    message("📊 Lines deleted: ${git.deletions}")
    
    warn("⚠️ This is a test warning - Danger warnings work!")
    
    // Uncomment this to test failures:
    // fail("❌ This is a test failure - Danger failures work!")
    
    message("🎉 All Danger checks completed!")
}