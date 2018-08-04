const Sequelize = require('sequelize');

//TODO creating model

module.exports = function (sequelize) {
   let Project = sequelize.define('Project',{
       title:{
           type: Sequelize.TEXT,
           allowNull: false,
       },
       description:{
           type: Sequelize.TEXT,
           allowNull: false,
       },
       budget:{
           type: Sequelize.TEXT,
           allowNull: false,
       }
   },{
       timestamps:false
   })
    return Project;
};