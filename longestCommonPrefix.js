function longestCommonPrefix(strs) {
    let str = strs[0];
    let commonPrefix = '';
    for(i = 0; i < str.length; i++) {
        for(j = 0; j < strs.length; j++) {
            if(strs[j].length < commonPrefix.length || strs[j].charAt(i) !== str.charAt(i)) {
                return commonPrefix;
            }
        };
        commonPrefix += str.charAt(i);
    }
    return commonPrefix;   
}

// Simple test code.
// let strs = ['Guava', 'Guacamole', 'Guapa', 'Guarda']
// console.log(longestCommonPrefix(strs));