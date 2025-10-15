import systems.danger.kotlin.*

danger(args) {
    message("✅ Danger Kotlin is working!")
    
    // Git info
    message("📁 Modified files: ${git.modifiedFiles.size}")
    message("➕ Added files: ${git.createdFiles.size}")
    message("➖ Deleted files: ${git.deletedFiles.size}")
    
    // Stats
    message("📊 Lines added: ${git.insertions}")
    message("📊 Lines deleted: ${git.deletions}")
    
    // Check PR size
    val totalLines = (git.insertions ?: 0) + (git.deletions ?: 0)
    if (totalLines > 500) {
        warn("⚠️ Large PR: $totalLines lines changed")
    }
    
    message("🎉 All checks completed!")
}