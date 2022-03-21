"use strict";
class Users {
    constructor(name, ...messages) {
        this.name = name;
        this.messages = messages;
    }
}
class chatRoom {
    constructor(roomId, ...user) {
        this.roomId = roomId;
        this.user = user;
    }
    getAllUsers() {
        this.user.forEach(i => console.log(i.name));
    }
    getAllMessages() {
        this.user.forEach(i => console.log(i.messages));
    }
}
let user1 = new Users("abc", "ghjasd", "hjkads", "ghj");
let user2 = new Users("bcd", "hjk", "yuiasdh", "hiasd", "ashjkldf");
let user3 = new Users("def", "hjk", "yuiasdh", "hiasd", "ashjkldf");
let user4 = new Users("efg", "ghjasd", "hjkads", "ghj");
let chatRoom1 = new chatRoom(1, user1, user2);
let chatRoom2 = new chatRoom(1, user3, user4);
let allUsers = new Set();
allUsers.add(user1);
allUsers.add(user2);
allUsers.add(user3);
allUsers.add(user4);
let userRoom = new Map();
userRoom.set(user1, chatRoom1);
userRoom.set(user2, chatRoom1);
userRoom.set(user3, chatRoom1);
userRoom.set(user4, chatRoom2);
console.log(allUsers);
console.log(userRoom);
console.log(userRoom.get(user4));
chatRoom1.getAllUsers();
chatRoom1.getAllMessages();
chatRoom2.getAllUsers();
//# sourceMappingURL=demo.js.map