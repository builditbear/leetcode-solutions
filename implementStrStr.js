/**
 * Solution to #28: Implement strStr().
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  if (needle === "") {
    return 0;
  } else {
    for (let i = 0; i <= haystack.length - needle.length; i++) {
      if (haystack.substring(i, i + needle.length) === needle) return i;
    }
    return -1;
  }
};
