# rn-commonjs
Test React Native commonjs processing

# Usage

1. Check out https://github.com/facebook/react-native into a sibling directory of this project. (The `Libraries` symbolic linc points into it.)
2. `lein cljsbuild once`

Then look in `out` to see the generated files.

Note: The `:foreign-libs` portion of `project.clj` was produced using [derevo](https://github.com/mfikes/derevo).
