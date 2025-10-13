# Simple test Dangerfile

message("✅ Danger is working!")
message("📁 Current directory: #{Dir.pwd}")

# Show git information
message("🔀 Modified files: #{git.modified_files.join(', ')}")
message("➕ Added files: #{git.added_files.join(', ')}")
message("➖ Deleted files: #{git.deleted_files.join(', ')}")

# Show some stats
message("📊 Lines added: #{git.insertions}")
message("📊 Lines deleted: #{git.deletions}")

warn("⚠️ This is a test warning - Danger warnings work!")

# Uncomment this to test failures:
# fail("❌ This is a test failure - Danger failures work!") 

message("🎉 All Danger checks completed!")